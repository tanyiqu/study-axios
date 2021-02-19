import Vue from 'vue'
import App from './App.vue'

import MyAxiosHttp from '@/plugin/http.js';
Vue.use(MyAxiosHttp);

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
