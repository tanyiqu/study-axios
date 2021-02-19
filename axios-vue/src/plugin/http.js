/**
 * axios vue插件
 */

import axios from 'axios';

const MyAxiosHttp = {};

const axios_instance = axios.create({
    baseURL: 'http://127.0.0.1:8866/',
    timeout: 5000
});


MyAxiosHttp.install = (Vue) => {

    /**
     * 添加get方法 这个方法我写的比较简单，可以按照你们的需求完善
     * 返回一个Promise
     * 并将错误信息全部转换成字符串
     * @param {*} path 
     * @param {*} params 
     */
    Vue.prototype.$get = (path, params) => {
        return new Promise((resolve, reject) => {
            axios_instance.get(path, {
                params: params
            }).then(res => {
                resolve(res.data);
            }).catch(err => {
                reject('服务器异常');
            });
        });
    }
};

export default MyAxiosHttp;