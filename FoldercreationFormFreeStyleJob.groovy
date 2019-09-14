freeStyleJob('CreateFolderfreestyle') {
	scm {
        git {
            remote {
                name('remoteB')
                url('git@server:pragnyasahoo/JenkinTest.git')
            }
		}
	}
    steps {
        dsl {
            external('FoldercreationScript.groovy')          
        }
    }
}
