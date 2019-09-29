pipelineJob('2909seedjob') {

    
    definition {
        cps {
            script(readFileFromWorkspace('testpipelinejob.groovy'))           
        }   
            
        }
    }