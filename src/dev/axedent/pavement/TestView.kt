package dev.axedent.pavement

import tornadofx.*

class TestView : View() {
    override val root = vbox {
        button("Press me")
        label("Waiting")
    }
}