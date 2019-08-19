from flask import Flask, Response
import logging as logger

logger.basicConfig(level="INFO")

app = Flask("Service Two")

@app.route("/random")
def random():
    import random
    data = f'{{"number": {int(1000 * random.random())} }}'
    return Response( data, content_type="application/json")

logger.info("Start Flask server")
app.run(host="0.0.0.0", port=5000, debug=True, use_reloader=True)