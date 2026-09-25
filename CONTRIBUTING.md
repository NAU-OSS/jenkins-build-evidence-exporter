# Contributing to Jenkins Build Evidence Exporter

Thank you for your interest in contributing to Jenkins Build Evidence Exporter.

Contributions of all sizes are welcome. You do not need to implement a major feature to contribute to the project. Bug reports, documentation improvements, tests, and small improvements are all valuable.

## Ways to Contribute

You can contribute by:

- Reporting bugs
- Suggesting new features
- Improving documentation
- Adding or improving tests
- Improving error handling
- Improving the evidence format
- Improving Jenkins integration
- Fixing existing issues

## Before You Start

Before making a contribution:

1. Check the existing GitHub Issues.
2. Check whether someone is already working on the same problem.
3. For larger changes, open an issue first and describe the proposed change.
4. Make sure your contribution is consistent with the project's scope.

The project is intentionally focused on Jenkins build evidence. Contributions that significantly expand the project into a general enterprise compliance platform may require discussion before implementation.

## Reporting a Bug

Please open a GitHub Issue using the bug report template.

Include:

- Jenkins version
- Plugin version
- Operating system
- Job type
- Steps to reproduce the problem
- Expected behavior
- Actual behavior
- Relevant logs or error messages

Do not include passwords, access tokens, credentials, private source code, or other sensitive information in an issue.

## Suggesting a Feature

Please use the feature request template.

Describe:

- The problem you want to solve
- Why the feature would be useful
- How you expect it to work
- Examples of possible usage

Please explain how the proposal fits within the project's scope.

## Development Environment

The project is implemented as a Jenkins plugin using Java and the Jenkins plugin development ecosystem.

A development environment should include:

- A supported JDK
- Maven
- Git
- A Jenkins development/test environment

Clone the repository:

```bash
git clone <repository-url>
cd jenkins-build-evidence-exporter
```

Build the project with:

```bash
mvn verify
```

## Testing

Contributions should include tests when appropriate.

Before opening a pull request, run:

```bash
mvn verify
```

Please make sure existing tests pass before submitting your changes.

## Pull Requests

When submitting a pull request:

1. Create a branch for your change.
2. Make the change.
3. Add or update tests when appropriate.
4. Update documentation when necessary.
5. Run the test suite.
6. Open a pull request with a clear description.

The pull request description should explain:

- What changed
- Why the change was needed
- How it was tested

## Code Review

Pull requests are reviewed before they are merged.

Reviewers may request changes related to:

- Correctness
- Tests
- Code quality
- Documentation
- Backward compatibility
- Project scope

Contributors are encouraged to participate in the discussion and explain design decisions when appropriate.

## Roadmap and Project Scope

The current roadmap is documented in [docs/roadmap.md](docs/roadmap.md).

The project currently focuses on collecting and exporting evidence from Jenkins builds.

New functionality should generally support this goal.

## Communication

GitHub Issues are the primary place for:

- Bug reports
- Feature requests
- Technical discussions related to an issue

Keeping project discussions public helps future contributors understand previous decisions and avoids repeating the same discussions.

## Thank You

Every contribution helps improve the project.

Thank you for taking the time to report problems, improve documentation, write tests, or contribute code.