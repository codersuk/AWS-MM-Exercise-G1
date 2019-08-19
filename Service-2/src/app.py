from flask import Flask, Response

app = Flask("Service Two")

@app.route("/random")
def random():
    import random
    return Response(f'{{number: { int(1000 * random.random()) }}}', mimetype="application/json")

app.run()