<template>
  <div class="container">
    <div class="row">
      <div class="col-12 text-center">
        <h4 class="pt-3">Search Product</h4>
      </div>
    </div>

    <div class="row">
      <div class="col-3"></div>
      <div class="col-md-6 px-5 px-md-0">
        <form>
          <div class="form-group">
            <label>Category</label>
          </div>
          <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" v-model="name" required>
          </div>
          <div class="form-group">
            <label>Description</label>
            <input type="text" class="form-control" v-model="description" required>
          </div>
          <button type="button" class="btn btn-primary" @click="searchProducts">Search</button>
        </form>
      </div>
      <div class="col-3"></div>
    </div>
  </div>
</template>

<script>
var axios = require('axios')
import swal from 'sweetalert';
export default {
  data(){
    return {
      categoryId : null,
      name : null,
      description : null,
      imageURL : null,
      sku : null,
      price : null
    }
  },
  props : ["baseURL", "categories"],
  methods : {
    async searchProducts() {
      const searchProduct = {
        id : this.id,
        name : this.name,
        description : this.description,
        imageURL : this.imageURL,
        price : this.price,
        sku : this.sku
      }

      await axios({
        method: 'post',
        url: this.baseURL+"product/search",
        data : JSON.stringify(searchProduct),
        headers: {
          'Content-Type': 'application/json'
        }
      })
          .then(() => {
            swal({
              text: "Product search Successful!",
              icon: "success",
              closeOnClickOutside: false,
            });
          })
          .catch(err => console.log(err));
    }
  },
  mounted() {
    this.searchProducts();
  }
}
</script>

<style scoped>
h4 {
  font-family: 'Roboto', sans-serif;
  color: #484848;
  font-weight: 700;
}

</style>
