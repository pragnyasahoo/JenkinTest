freeStyleJob('CreateFolderfreestyle') {
	description('Create Folder by freestyle downstream job')
      scm {
        git {
            remote {
                name('origin')
                url('https://github.com/pragnyasahoo/JenkinTest.git')
            }
        }
      }
    steps {
        dsl {
            external('FoldercreationScript.groovy')
            removeAction('DISABLE')
            ignoreExisting()
         
        }
    }
}
