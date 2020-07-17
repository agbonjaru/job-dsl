job('NodeJS example'){
    scm {
        git('git://github.com/agbonjaru/notch.git'){
            node -> //is hudson.plugin.git.GitSCM
            node / gitConfigName('agbonjaru')
            node / gitConfigEmail('jstryngs@gmail.com')
        
        }
    }
triggers {
    scm('H/5 * * * *')
}
wrappers {
    nodejs('nodejs') //this is the name of node js installation
                     //Manage jenkins -> Configure Tools -> NodeJs installation

}
steps {
    shell("npm install")
}

}