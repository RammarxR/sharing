def checkout(String url, String branch = 'master') {
  // Perform the checkout using the provided URL and branch
  git url: url, branch: branch
}
