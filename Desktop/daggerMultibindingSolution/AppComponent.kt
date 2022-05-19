

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.multibindings.IntoMap

@Component(modules = [AppBindsModule::class])
@AppScope
interface AppComponent {

    @Component.Builder
    interface Builder {

        fun build(): AppComponent
    }

    fun factory() : ViewModelFactory
}

@Module
interface AppBindsModule {

    @Binds
    @[IntoMap ViewModelKey(ExampleFirstViewModel::class)]
    fun provideExampleFirstViewModel(exampleFirstViewModel: ExampleFirstViewModel): ViewModel

    @Binds
    @[IntoMap ViewModelKey(ExampleSecondViewModel::class)]
    fun provideExampleSecondViewModel(exampleSecondViewModel: ExampleSecondViewModel): ViewModel
}