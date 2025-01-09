package com.example.android.repository

import android.adservices.adid.AdId
import com.example.android.model.UserModel
import com.google.firebase.auth.FirebaseUser

interface UserRepository {
//    {
//        "success" : true,
//        "meessage" : "Login success",
//    }
    fun login(email:String,password:String,callback:(Boolean,String) -> Unit)

    fun signup(email: String,password: String,callback:(Boolean,String,String) -> Unit)

    fun forgetPassword(email:String,callback: (Boolean,String) -> Unit)

    fun addUserToDatabase(userId: String,userModel: UserModel,
                          callback: (Boolean, String) -> Unit)

    fun getCurrentUser() : FirebaseUser?
}