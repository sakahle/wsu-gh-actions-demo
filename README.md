# GitHub Actions Demo

This repo contains a simple Java application that adds two numbers and exits.
It also has a workflow set up in the .github/workflows directory that builds and publishes an image that runs the application to DockerHub.

## You must follow the following steps to allow GitHub to publish to DockerHub

1. Create an account on DockerHub: [](https://app.docker.com/signup)
2. Create a Personal Access Token: https://app.docker.com/settings/personal-access-tokens\
Set access permissions to Read & Write and give it any name you'd like. Click 'Generate'.
3. Copy the personal access token in box number 2.
4. Back in your GitHub repository, go to Settings
5. Navigate to Security > Secrets and variables > Actions
6. Create a new Repository Secret. Make the name `DOCKERHUB_USERNAME`, and enter your username as the secret, click Add secret.
7. Create another Repository Secret, and call this one `DOCKERHUB_TOKEN`. In the Secret box, enter the personal access token you copied from DockerHub and click Add secret.
8. Make a new commit, and navigate to the actions tab. You should see a new workflow run in progress. You can click into it to see where it's at. When it's done, you should see a green checkmark and that the image was successfully published to DockerHub.

Once your image is pushed, you can do `docker run <image name>` to run it.

Success! Your application will now build every time a new change is committed to main.
