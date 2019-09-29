node('master') {
    git(
			url: "$https://github.com/pragnyasahoo/JenkinTest.git",
			branch: "master"
		)
    stage("Prepare"){
        println("Preparing...")
    }
    stage("Clone"){
        println("Building the app Clone maven")
    }
    stage("Build"){
        println("Building the app using maven")
    }
    stage("Test"){
        println("Testing...")
    }
    stage("Deploy"){
        println("Deploying...")
    }
}