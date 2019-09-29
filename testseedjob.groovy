pipelineJob('2909seedjob') {

    
    definition {
        cps {
            script(readFileFromWorkspace('testpipelinestage.groovy'))           
        }   
            
        }
    }