<template>
  <div id="app">
    <Get />
    <Post />
    <ArrayPost />
  </div>
</template>

<script>
import Get from '@/components/Get.vue';
import Post from '@/components/Post.vue';
import ArrayPost from '@/components/ArrayPost.vue';

export default {
  name: 'App',
  components: {
    Get,
    Post,
    ArrayPost
  },
}
</script>

