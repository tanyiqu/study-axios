<template>
  <div id="app">
    <button @click="arrayPost">array post</button>
  </div>
</template>

<script>
import axios from 'axios'
import qs from 'qs'

export default {
  name: 'App',
  components: {
  },


  methods: {
    arrayPost() {
      console.log('send array post');
      axios.post('http://127.0.0.1:8866/array/post', qs.stringify(
        {
          ids: [1, 2, 3]
        },
        {
          indices: false
        }
      )).then(data => {
        console.log(data.data);
      });
    },
  }
}
</script>

<style>
#app {
}
</style>
