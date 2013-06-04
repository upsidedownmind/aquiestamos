package com.github.upsidedownmind.aquiestamos

import org.scalatra._
import scalate.ScalateSupport

class IndexServlet extends AquiEstamosStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
