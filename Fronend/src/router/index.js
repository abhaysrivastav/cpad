import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import AddCategory from "../views/Category/AddCategory";
import Category from "../views/Category/Category";
import AddProduct from "../views/Product/AddProduct";
import Product from "../views/Product/Product";
import ShowDetails from "../views/Product/ShowDetails";
import Signup from "../views/Signup";
import Signin from "../views/Signin";
import WishList from "../views/Product/ WishList";
import Cart from "../views/cart/Cart";

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },

  {
    path: "/admin/category/add",
    name: "AddCategory",
    component: AddCategory,
  },

  {
    path: "/admin/category",
    name: "AdminCategory",
    component: Category,
  },

  {
    path: "/admin/product/add",
    name: "AddProduct",
    component: AddProduct,
  },

  {
    path: "/admin/product",
    name: "AdminProduct",
    component: Product,
  },

  {
    path : '/product/show/:id',
    name : 'ShowDetails',
    component: ShowDetails
  },
  {
    path: '/signup',
    name: 'Signup',
    component: Signup
  },
  {
    path: '/signin',
    name: 'Signin',
    component: Signin
  },
  {
    path: '/wishlist',
    name: 'WishList',
    component: WishList
  },
 {
    path: '/admin/product/search',
    name:'Search',
    component: Search
  },
  {
    path : '/cart',
    name : 'Cart',
    component : Cart
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
