

import androidx.fragment.app.Fragment

class ExampleFragment : Fragment() {

    val exampleViewModel: ExampleViewModel by lazyViewModel {
        exmpleComponent.exampleViewModel().create(it)
    }
}