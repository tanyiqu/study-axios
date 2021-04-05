<template>
  <div>
    <button @click="getNoParam">get no param</button>
    <br />
    <button @click="getWithParams">get with params</button>
  </div>
</template>

<script>
import axios from 'axios'
import qs from 'qs'

export default {
  methods: {
    // 不带参数的get请求
    getNoParam() {
      axios.get('http://127.0.0.1:8866/user/allUsers').then(function (response) {
        console.log('不带参数的get请求');
        console.log(response.data);
      }).catch(function (error) {
        console.log('不带参数的get请求');
        console.log(error);
      });
    },


    // 带参数的get请求
    getWithParams() {
      axios.get('http://127.0.0.1:8866/user/findById', {
        params: {
          id: 2
        }
      }).then(function (response) {
        console.log('带参数的get请求');
        console.log(response.data);
      }).catch(function (error) {
        console.log('带参数的get请求');
        console.log(error);
      });
    },

  }

}
</script>


<style>
</style>