<template>
  <div v-bind:class="{ BlogCell: isBlogCell, BlogCell_show: isBlogCellShow, BlogCell_dis: isBlogCellDis}" @mouseout="showDown" @mouseover="showUp">
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
                "imgUrl": this.content["blogImg"],
                "isBlogCell": true,
                "isBlogCellDis": false,
                "isBlogCellShow": false
            }
        },
        methods: {
          showDown: function () {
            let self = this
            self.isBlogCellDis = true
            self.isBlogCellShow = false
            /*
            setTimeout(function() {
              self.isBlogCellDis = false
              self.isBlogCellShow = false
            }, 1000)
            */
          },

          showUp: function () {
            let self = this
            self.isBlogCellShow = true
            self.isBlogCellDis = false
            /*
            setTimeout(function() {
              self.isBlogCellDis = false
              self.isBlogCellShow = false
            }, 1000)
            */
          }
        },
        props: {
            content: Object
        }
    }

</script>

<style scoped>
  @keyframes showUp {
    from {
      opacity: 0.6;
    }
    to {
      opacity: 1.0;
    }
  }
  @keyframes showDown {
    from {
      opacity: 1;
    }
    to {
      opacity: 0.6;
    }
  }

  .leftContent, .rightImg {
    background-color: white;
  }
  .BlogCell_show {
    height: 200px;
    background-color: white;
    animation:  0.3s ease-out forwards showUp;
  }

  .BlogCell {
    height: 200px;
    background-color: white;
    opacity: 0.6;
    cursor: pointer;
  }
  
  .BlogCell_dis {
    height: 200px;
    background-color: white;
    animation: 0.3s ease-out forwards showDown;
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
    border-radius: 5px;
    height: 150px;
    width: 150px;
    margin-top: 25px;
    margin-bottom:auto;
    margin-left: 20%;
  }

</style>
