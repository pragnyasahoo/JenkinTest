job('Create Folder freestyle') {
    steps {
        dsl {
            external('FoldercreationScript.groovy')          
        }
    }
}
