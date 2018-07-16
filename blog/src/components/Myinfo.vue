<template>
  <div class="myinfo">
    <img class="headImg" src="../assets/Head.png"/>
    <p>白彬涵的博客</p>
    <p>Hancock's Blog</p>
    <p class="content">我是一个 22 岁的 homeschooler，爱好旅行以及一切富有创造性的事物，尤其是摄影、设计和编程。这个世界就是我的学校。学自己之所想所爱。自由的身心定能使我成为一个一直朝前行走的行者。</p>
  </div>
</template>

<script>
  export default {
    name: 'MyInfo'
  }
</script>

<style scoped>
  .headImg {
    width: 25%;
    margin-bottom: 10px;
  }
  p {
    color: aliceblue;
    margin: 0;
  }
  .content {
    color: aliceblue;
    width: 80%;
    margin-left: auto;
    margin-right: auto;
    text-align: left;
    margin-top: 30px;
  }
</style>
