
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VedeoManager from "./components/listers/VedeoCards"
import VedeoDetail from "./components/listers/VedeoDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/vedeos',
                name: 'VedeoManager',
                component: VedeoManager
            },
            {
                path: '/vedeos/:id',
                name: 'VedeoDetail',
                component: VedeoDetail
            },




    ]
})
