freeStyleJob('CreateFolderfreestyle') {
	scm {
        git {
            remote {
                name('master')
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
