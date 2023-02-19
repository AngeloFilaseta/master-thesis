@file:JsModule("react-bootstrap/Navbar")
@file:JsNonModule

@JsName("default")
external val Navbar: ComponentClass<NavbarProps>

external interface NavbarProps : Props {
    var bg: String
    var variant: String
}
