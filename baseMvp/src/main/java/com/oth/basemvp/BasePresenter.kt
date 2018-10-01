package com.oth.basemvp

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {

    protected lateinit var view: V

    override fun bind(view: V) {
        this.view = view

        onBound(view)
    }

    override fun onBound(view: V) {
    }

    override fun unbind(view: V) {
        onUnbound(view)
    }

    override fun onUnbound(view: V) {
    }
}