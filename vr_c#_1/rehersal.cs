// Å bruke unity til å lage CS script vil automatisk kompilere koden for oss.
// dra scriptet over til objektet det skal virke på.

[SerializedField]
Meshrenderer renderer;



void Start (){


}

void Update (){

    bool pressed = Input.getKey(KeyCode.Space);
    if (pressed)
    {
          renderer.materialColor = Color.red;

          transform.position = new Vector3(10, 10, 10);

    }



}