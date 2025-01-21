# Scala Auxiliary Constructor Default Value Bug

This repository demonstrates a subtle bug in Scala related to auxiliary constructors and default parameter values.

The bug arises when an auxiliary constructor does not explicitly initialize parameter values of the primary constructor which may be relied upon.  This can lead to unexpected behavior.

## Bug Description
The `bug.scala` file contains the buggy code. The `bugSolution.scala` file offers a corrected version.

## How to Reproduce
1. Clone this repository.
2. Compile and run `bug.scala`. Observe that the value of `x` may not be what you expect or a runtime exception occurs.
3. Compile and run `bugSolution.scala`. Observe the corrected behavior.

## Solution
Always explicitly initialize parameters of the primary constructor when using an auxiliary constructor, even if you intend to use a default value.  Don't rely on implicit initializations.