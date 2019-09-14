freeStyleJob('CreateFolderfreestyle') {
	scm
	{
		github('pragnyasahoo/JenkinTest','master','ssh')
	}
    steps {
        dsl {
            external('FoldercreationScript.groovy')          
        }
    }
}
