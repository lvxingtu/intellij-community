// "Extend 'Parent'" "true"
sealed class Parent permits Child {}

final class Child extends Parent {}