<template>
  <div>
    <button @click="postNoParam">post no param</button>
    <br />
    <button @click="postWithParams">post with params</button>
  </div>
</template>

<script>
import axios from 'axios'
import qs from 'qs'

export default {
  methods: {
    // 不带参数的post请求
    postNoParam() {
      axios.post('http://127.0.0.1:8866/user/allUsersPost').then(function (response) {
        console.log('不带参数的post请求');
        console.log(response.data);
      }).catch(function (error) {
        console.log(error);
      });
    },


    // 带参数的post请求
    postWithParams() {
      axios.post('http://127.0.0.1:8866/user/findByIdPost', qs.stringify({
        id: 1
      })).then(function (response) {
        console.log('带参数的post请求');
        console.log(response.data);
      }).catch(function (error) {
        console.log(error);
      });
    },

  }

}
</script>


<style>
</style>