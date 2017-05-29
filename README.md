# MyCalculator - Testable Android App Kata


## Before beginning

TDD / MV* Approach / Fully testable Android Application

JUnit, Mockito 2

Kotlin Inside ;)

## MVP in a nutshell

**Model**: the data layer

**View**: the UI layer, displays data received from Presenter, reacts to user input. On Android, we treat Activities, Fragments, and android.view.View as View from MVP.

**Presenter**: responds to actions performed on the UI layer, performs tasks on Model objects (using Use Cases), passes results of those tasks to Views.

[View] ->> user events >> [Presenter]
[Presenter] ->> updates >> [View]	
[Presenter] ->> interactions/use cases >> [Model]
[Model] ->> updates >> [Presenter] 


[http://macoscope.com/blog/model-view-presenter-architecture-in-android-applications/]()

[https://medium.com/proandroiddev/clean-your-activity-using-delegation-pattern-fcaafd82336d]()

## TODO

* Typing digit button display digit to screen
* Applying operator +,-,x,/
* Allow decimal numbers
* Complete Expression Display e.i: "2000.5 + 10"
* Parenthesis Handle





