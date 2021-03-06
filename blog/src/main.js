// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import Myinfo from './components/Myinfo'
import ElementUI from 'element-ui';
import VueShowdown from 'vue-showdown'
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(VueShowdown, {
  emoji: true
})

Vue.config.productionTip = false
Vue.use(ElementUI)
Vue.component(Myinfo)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
