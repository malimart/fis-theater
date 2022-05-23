Vue.createApp({
    data() {
      return {
        visitor: {
          firstname: '',
          lastname: ''
        }
      }
    },
    methods: {
        addVisitor(){
            alert("ABOUT TO ADD VISITOR " + this.visitor.firstname + " " + this.visitor.lastname)
        }
    },
    mounted: function() {
      
    }
  }).mount("#visitor")
  