pipelineJob('2909seedjob') {

    
    definition {
        cps {
            script(readFileFromWorkspace('pipelinestage.groovy'))           
        }   
            
        }
    }