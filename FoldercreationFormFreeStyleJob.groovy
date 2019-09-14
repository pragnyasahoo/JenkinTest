freeStyleJob('Create Folder freestyle') {
    steps {
        dsl {
            external('FoldercreationScript.groovy')          
        }
    }
}
