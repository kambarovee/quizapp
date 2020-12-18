package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What is this logo?",
            R.drawable.twitch,
            "Twitch",
            "Youtube",
            "Mixer",
            "Instagram",
            1
        )
        val que2 = Question(
            2,
            "What is this logo?",
            R.drawable.facebook,
            "VK",
            "Telegram",
            "Facebook",
            "Instagram",
            3
        )
        val que3 = Question(
            3,
            "What is this logo?",
            R.drawable.github,
            "Google",
            "Reddit",
            "Twitter",
            "Github",
            4
        )
        val que4 = Question(
            4,
            "What is this logo?",
            R.drawable.instagram,
            "Linkedin",
            "Facebook",
            "Whatsapp",
            "Instagram",
            4
        )
        val que5 = Question(
            5,
            "What is this logo?",
            R.drawable.linkedin,
            "Reddit",
            "Linkedin",
            "Mixer",
            "Spotify",
            2
        )
        val que6 = Question(
            6,
            "What is this logo?",
            R.drawable.reddit,
            "Reddit",
            "Twitter",
            "Soundcloud",
            "Spotify",
            1
        )
        val que7 = Question(
            7,
            "What is this logo?",
            R.drawable.soundcloud,
            "Spotify",
            "Youtube",
            "Soundcloud",
            "Twitch",
            3
        )
        val que8 = Question(
            8,
            "What is this logo?",
            R.drawable.spotify,
            "Twitch",
            "Spotify",
            "Mixer",
            "Reddit",
            2
        )
        val que9 = Question(
            9,
            "What is this logo?",
            R.drawable.twitter,
            "Twitch",
            "Twitter",
            "Mixer",
            "Whatsapp",
            2
        )
        val que10 = Question(
            10,
            "What is this logo?",
            R.drawable.youtube,
            "Twitch",
            "Youtube",
            "Mixer",
            "Instagram",
            2
        )

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)
        return questionList
    }
}