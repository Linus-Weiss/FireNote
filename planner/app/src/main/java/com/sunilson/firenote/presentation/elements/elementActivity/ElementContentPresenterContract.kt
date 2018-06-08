package com.sunilson.firenote.presentation.elements.elementActivity

import com.sunilson.firenote.data.models.Element
import com.sunilson.firenote.presentation.shared.base.IBaseView

interface ElementContentPresenterContract {
    interface Presenter {
        fun loadElementData()
    }

    interface View : IBaseView {
        fun canLeave() : Boolean = true
        fun titleEditToggled(active : Boolean)
        val element: Element?
    }
}