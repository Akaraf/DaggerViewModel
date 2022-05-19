

import dagger.Component

@Component()
interface ExampleComponent {

    fun exampleViewModel() : ExampleViewModel.Factory
}