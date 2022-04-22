# Section 26 Testing in CI/CD Pipeline

Pada materi ini membahas :

1. Introduction CI / CD
2. What Makes for Good CI/CD
3. CI/CD Process
4. Benefit and Costs from CI/CD
5. CI/CD Tools
6. Github Actions
7. Practice Testing API in CI Using github

# Introduction CI / CD

### Continuous Integration

> Practice of integrating code into shared repository and building and testing each change automatically as soon as possible, several ties a day

- Practice : Integration with version control
  <br> Pada setiap commit, dilakukan automated test and build untuk mengetahui hasil kode, Apabila terdapat kesalahan, kode tersebut tidak dapat diteruskan ke production
  <br>
  3 Stages in CI Pipeline

> Build > Unit Tests > Integration Test

### Continous Delivery / Deployment

> Software can be released to prduction at any time, often by automatically pushing changes to staging system , Code will automatically released to production
> <br> 3 Stages in CD Pipeline

> Review > Staging > Production

# Delivery vs Deployment

### Continous Delivery

- Automatically prepare and track release to a production
- Desired outcome : anyone with sufficient privileges to deploy a new release can do so at any time in one or a few clicks. Eliminationg all manual tasks, developers become more productive

### Continous Deployment

- Every change in the source code deployed to production automatically, without explicit approval from developer as long as it pass quality controls
- Continous delivery manually deploy to production, continous development automatically deploy to production

# What makes Good CI/CD

### Good CI

1.  Decoupled Stages
    (Each step in CI should do single focused task)
2.  Repeatable
    (Automated in a way that is consistently repeatable
    Tooling should work for local developers too)
3.  Fail Fast
    (Fail at the firs sign of trouble)

### Good CD

1.  Design with system in mind
    (Cover as many parts of a deployment as possible (Application, Infrastructure, Configuration, Data)
2.  Pipelines
    (Continually increase confidence as you move towards production)
3.  Globally Unique versions
    (Know the state of the system at any time
    Be able to demonstrate dfference between urrent and future state)

# CI / CD Process

1. Commit -> Developers write codes and commit, push to repository
2. Build -> New and old code compiled together
3. Test -> Testing the apps
4. Deploy -> Running software on test/staging server, run auto test, accept code to move to production

### Benefits of CI

- Detecting bug earlier
- reduces bug count
- Development process more transparent
- Efficient

### Benefits of CD

- Reduce risk of bugs, costs
- Painless deployment
- Automated and transparent process
- Releases more frequently

### Costs of CI

- Write automation test
- Server/Environment for automated test
- Merge code as often as possible

### Costs of CD

- Strong foundations in CI
- Need highest quality of test
- Documentation needs to be updated frequently

# CI CD Tools

- Jenkins
- Gitlab CI
- Atlassian Bamboo
- Circle CI
- AWS Codebuild
- Azure Devops
- Travis CI
- Github Actions

# Workflows

- Configurable automated process, run one/more jobs
- Defined by a YAML file in repository
- Run automatically when triggered by an event in repository
- Run manually by manual trigger or defined schedule

## Events

- Specific activity in repository, that triggers a workflow run
- Example : when someone in repository creates pull request, opens an issue, push commit

## Runners

- Server that runs workflows when triggered
- Each runner can run a single job at a time
- Gihub provides ubuntu, windows, macOs runner to run workflows

## Job

- Set of steps in a workflow, executed on the same runner
- Shell script that will be executed, an action that will be run
- Steps executed in order and dependent on each other
- Data can be shared on the same runner, between Job

## Action

- Custom application for GitHub Actions
- Performs a complex but frequently repeated task
- Help reducing repetitive code that written in workflow files
