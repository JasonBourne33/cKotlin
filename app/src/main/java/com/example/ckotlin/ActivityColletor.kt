package com.example.ckotlin

import android.app.Activity

class ActivityColletor {
    object ActivityColltor{
        private val activities=ArrayList<Activity>()

        fun addActivity(activity: Activity){
            activities.add(activity)
        }
        fun removeActivity(activity: Activity){
            activities.remove(activity)
        }
        fun finishAll(){
            for(activity in activities){
                if(!activity.isFinishing){
                    activity.finish()
                }
                activities.clear()
            }
        }
    }
}