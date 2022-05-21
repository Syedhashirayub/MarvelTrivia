package com.syedhashirayub.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()
        val que1 =Questions(
            1, "What is the name of the Marel Superhero shown in the picture? ",
        R.drawable.ic_launcher_background,
            "Iron Man",
            "Captain America",
            "Hawkeye",
            "Black Widow",
            1
        )

        questionsList.add(que1)
        return questionsList
    }
}