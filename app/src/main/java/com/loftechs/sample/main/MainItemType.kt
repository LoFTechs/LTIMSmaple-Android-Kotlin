package com.loftechs.sample.main

import androidx.fragment.app.Fragment
import com.loftechs.sample.chat.list.ChatListFragment

enum class MainItemType {
    CHAT {
        override fun getFragment(): Fragment {
            return ChatListFragment.newInstance()
        }

        override fun onFabClick(view: MainContract.View?) {
            view?.gotoCreateChannel()
        }
    };

    abstract fun getFragment(): Fragment
    abstract fun onFabClick(view: MainContract.View?)
}