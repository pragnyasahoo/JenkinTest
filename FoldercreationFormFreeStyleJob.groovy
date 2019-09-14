freeStyleJob('CreateFolderfreestyle') {
    steps {
        dsl {
            external('FoldercreationScript.groovy')          
        }
    }
}
