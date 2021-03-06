@file:JsModule("timers")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package timers

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external fun setTimeout(callback: (args: Array<Any>) -> Unit, ms: Number, vararg args: Any): NodeJS.Timeout

external fun clearTimeout(timeoutId: NodeJS.Timeout)

external fun setInterval(callback: (args: Array<Any>) -> Unit, ms: Number, vararg args: Any): NodeJS.Timeout

external fun clearInterval(intervalId: NodeJS.Timeout)

external fun setImmediate(callback: (args: Array<Any>) -> Unit, vararg args: Any): NodeJS.Immediate

external fun clearImmediate(immediateId: NodeJS.Immediate)