<template>
  <div id="app"></div>
</template>

<script>

export default {
  name: 'App',
  components: {
  },
  beforeMount() {
    this.$get('user/findById', {
      id: 1
    }).then(res => {
      console.log(res);
    });
  },
}
</script>

<style>
#app {
}
</style>
