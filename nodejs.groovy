job('notch-app'){
    scm {
        git('git://github.com/agbonjaru/notch.git'){
            node -> //is hudson.plugin.git.GitSCM
            node / gitConfigName('agbonjaru')
            node / gitConfigEmail('jstryngs@gmail.com')
        
        }
    }
triggers {
    scm('H/5 * * * *')  //runs every 5 mins
}
wrappers {
    nodejs('nodejs') //this is the name of node js installation
                     //Manage jenkins -> Configure Tools -> NodeJs installation

}
steps {
    shell("npm install")
}

}