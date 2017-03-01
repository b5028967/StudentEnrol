package com.enrol

class LecturerController {

    def scaffold= Lecturer


def login(){

}

def validate(){
	def user = Lecturer.findByUserName(params.username)

	if (user && user.password == params.password){

		session.user = user

		render view:'home'
}

else{

	flash.message = "invalid username and password."

	render view:'login'

}

}

def logout = {

	session.user = null

	redirect(uri:'/')
}
}
