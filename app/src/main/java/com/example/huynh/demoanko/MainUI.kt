package com.example.huynh.demoanko

import android.graphics.Color
import android.view.Gravity
import org.jetbrains.anko.*

/**
 * Created by huynh on 29/12/2017.
 */
class MainUI:AnkoComponent<MainActivity> {
  override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
    verticalLayout {
      textView {
        text = "What's the magic behind this?"
        textColor = Color.BLACK
        textSize = 22f
      }.lparams(width = dip(350)){
        leftMargin = dip(10)
        topMargin = dip(10)
      }

      textView {
        text = "Lorem ipsum dolor sit amet, adip sicing elit, sed do eiusmod..."
        textSize = 20f
      }.lparams(width = dip(350)){
        leftMargin = dip(10)
      }

      textView {
        text = "We think that you may like these..."
        textColor = Color.BLACK
        textSize = 22f
      }.lparams(width = dip(350)){
        leftMargin = dip(10)
        topMargin = dip(15)
      }

      relativeLayout {
        topPadding = dip(15)
        imageView {
          id = R.id.image_view
          imageResource = R.drawable.ic_person_black_36dp
        }.lparams(width = wrapContent, height = wrapContent){
          leftMargin = dip(10)
          topMargin = dip(15)
        }
        textView {
          id = R.id.text1
          text = "Boost Juice Bar"
          textColor = Color.BLACK
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view)
          leftMargin = dip(5)
        }
        textView {
          id = R.id.text2
          text = "LG1.15"
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view)
          bottomOf(R.id.text1)
          leftMargin = dip(5)
        }
        textView{
          text = "View on map"
          id = R.id.viewonmap
          textColor = Color.BLUE
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view)
          bottomOf(R.id.text2)
          leftMargin = dip(5)
        }

        imageView {
          id = R.id.image_view1
          imageResource = R.drawable.ic_person_black_36dp
        }.lparams(width = wrapContent, height = wrapContent){
          leftMargin = dip(10)
          topMargin = dip(25)
          bottomOf(R.id.image_view)
        }
        textView {
          id = R.id.text11
          text = "MyeongDong Topokki"
          textColor = Color.BLACK
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view1)
          bottomOf(R.id.viewonmap)
          topMargin = dip(10)
          leftMargin = dip(5)
        }
        textView {
          id = R.id.text12
          text = "LG1.32"
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view1)
          bottomOf(R.id.text11)
          leftMargin = dip(5)
        }
        textView{
          text = "View on map"
          id = R.id.viewonmap1
          textColor = Color.BLUE
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view1)
          bottomOf(R.id.text12)
          leftMargin = dip(5)
        }

        imageView {
          id = R.id.image_view2
          imageResource = R.drawable.ic_person_black_36dp
        }.lparams(width = wrapContent, height = wrapContent){
          leftMargin = dip(10)
          topMargin = dip(30)
          bottomOf(R.id.image_view1)
        }
        textView {
          id = R.id.text21
          text = "Yan Woh Tong"
          textColor = Color.BLACK
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view2)
          bottomOf(R.id.viewonmap1)
          topMargin = dip(10)
          leftMargin = dip(5)
        }
        textView {
          id = R.id.text22
          text = "LG1.36"
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view2)
          bottomOf(R.id.text21)
          leftMargin = dip(5)
        }
        textView{
          text = "View on map"
          textColor = Color.BLUE
        }.lparams(width = wrapContent, height = wrapContent){
          rightOf(R.id.image_view2)
          bottomOf(R.id.text22)
          leftMargin = dip(5)
        }
      }

      button {
        text = "Start over"
        backgroundColor = Color.BLUE
        textColor = Color.WHITE
        gravity = Gravity.CENTER
      }.lparams(width = dip(280), height = dip(50)){
        gravity = Gravity.CENTER
        topMargin = dip(10)
      }
    }
  }
}