<template>
  <div class="BlogCell">
    <div class="leftContent">
      <h1>{{ title }}</h1>
      <p>{{ description }}</p>
      <p>{{ dateDescrip }}</p>
    </div>

    <div class="rightImg">
      <img class="imgContent" v-bind:src="imgUrl">
    </div>
  </div>

</template>

<script>
    export default {
        name: "BlogCell",
        data () {
            return {
                "title": this.content["title"],
                "description": this.content["description"],
                "dateDescrip": this.content["dateDescrip"],
                "imgUrl": "https://dn-ssl-dw-blog.qbox.me/files/2017/09/light-sensor-connected-to-anduino.jpg"
            }
        },
        props: {
            content: Object
        }
    }

</script>

<style scoped>
  .leftContent, .rightImg {
    background-color: white;
  }
  .BlogCell {
    height: 200px;
    background-color: white;
  }
  h1, p {
    text-align: left;
    margin-left: 20px;
  }

  .leftContent {
    float: left;
    width: 80%;
  }
  .rightImg {
    float: left;
    width: 10%;
  }
  .imgContent {
    box-shadow: 5px 5px 5px #9B9B9B;
    border-radius: 8px;
    height: 150px;
    width: 150px;
    margin-top: 25px;
    margin-bottom:auto;
    margin-left: 20%;
  }

</style>
