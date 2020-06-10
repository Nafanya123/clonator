package com.github.clonator;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Mojo(name = "clonator")
public class Plugin extends AbstractMojo {
    @Parameter(required = true)
    private String urlRepo;
    @Parameter(required = true)
    private File filePath;
    @Parameter(required = true)
    private String gitUser;
    @Parameter(required = true)
    private String gitPass;


    public void execute() {
        delete(filePath);
        try {
            Git git = Git.cloneRepository().setURI(urlRepo).setDirectory(filePath).setCredentialsProvider(getGitCred())
                    .call();
            git.getRepository().close();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
    }

    public List<String> getCredentials() {
        final String p1 = System.getProperty("reposUser");
        final String p2 = System.getProperty("reposPass");
        return Arrays.asList(p1 != null ? p1 : gitUser,
                p2 != null ? p2 : gitPass);
    }

    private UsernamePasswordCredentialsProvider getGitCred() {
        final List<String> credentials = getCredentials();
        return new UsernamePasswordCredentialsProvider(credentials.get(0), credentials.get(1));
    }

    public void delete(File file)
    {
        if(!file.exists())
            return;
        if(file.isDirectory())
        {
            for(File f : file.listFiles())
                delete(f);
            file.delete();
        }
        else
        {
            file.delete();
        }
    }
}
