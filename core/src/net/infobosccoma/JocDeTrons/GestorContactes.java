package net.infobosccoma.JocDeTrons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Manifold;
import net.infobosccoma.JocDeTrons.Screens.Level1;
import net.infobosccoma.JocDeTrons.Screens.Level2;
import net.infobosccoma.JocDeTrons.Screens.MainMenuScreen;
import java.util.ArrayList;

/**
 * Classe que implementa la interface de gestió de contactes
 * 
 * @author Marc
 *
 */

public class GestorContactes implements ContactListener {
	//<editor-fold desc="Atributs">
	// de moment, no utilitzat
	private ArrayList<Body> bodyDestroyList;
	//</editor-fold>
    private JocDeTrons joc;

    private long vides;

	//<editor-fold desc="Constructors">
	public GestorContactes(JocDeTrons joc, long vides) {

		this.joc = joc;
        this.vides = vides;

	}
	
	public GestorContactes(ArrayList<Body> bodyDestroyList) {
		this.bodyDestroyList = bodyDestroyList;
	}
	@Override
	public void beginContact(Contact contact) {
		Fixture fixtureA = contact.getFixtureA();
		Fixture fixtureB = contact.getFixtureB();

		if (fixtureA.getBody().getUserData() == null || fixtureB.getBody().getUserData() == null) {

			return;

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("foc1") || fixtureA.getBody().getUserData().equals("foc1") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
				Gdx.app.postRunnable(new Runnable() {
					@Override
					public void run() {

                        if(vides == 0) {

                            joc.setScreen(new MainMenuScreen(joc));

                        }
                        else {

                            joc.setScreen(new Level1(joc, 9.0f, 4.0f, vides));

                        }
					}
				});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("foc2") || fixtureA.getBody().getUserData().equals("foc2") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 9.0f, 4.0f, vides));

                    }
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("foc3") || fixtureA.getBody().getUserData().equals("foc3") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 9.0f, 4.0f, vides));

                    }
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("punxes1") || fixtureA.getBody().getUserData().equals("punxes1") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 9.0f, 4.0f, vides));

                    }
				}
			});


	}
		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("punxes2") || fixtureA.getBody().getUserData().equals("punxes2") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 45.0f, 4.0f, vides));

                    }
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("punxes3") || fixtureA.getBody().getUserData().equals("punxes3") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 45.0f, 4.0f, vides));

                    }
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("aigua") || fixtureA.getBody().getUserData().equals("aigua") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 82.0f, 4.0f, vides));

                    }
				}
			});

		}

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("guadanya1") || fixtureA.getBody().getUserData().equals("guadanya1") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 82.0f, 4.0f, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("guadanya2") || fixtureA.getBody().getUserData().equals("guadanya2") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 82.0f, 4.0f, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("guadanya3") || fixtureA.getBody().getUserData().equals("guadanya3") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 82.0f, 4.0f, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("guadanya4") || fixtureA.getBody().getUserData().equals("guadanya4") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level1(joc, 82.0f, 4.0f, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("tronoHierro1") || fixtureA.getBody().getUserData().equals("tronoHierro1") && fixtureB.getBody().getUserData().equals("Personatge")) {

            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

					joc.setScreen(new Level1(joc, 2.0f, 4.0f, 5));
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("tronoHierro2") || fixtureA.getBody().getUserData().equals("tronoHierro2") && fixtureB.getBody().getUserData().equals("Personatge")) {

            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    joc.setScreen(new MainMenuScreen(joc));
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit") || fixtureA.getBody().getUserData().equals("buit") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;

            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }

                }
            });

        }

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit1") || fixtureA.getBody().getUserData().equals("buit1") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
				}
			});

		}

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit2") || fixtureA.getBody().getUserData().equals("buit2") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit3") || fixtureA.getBody().getUserData().equals("buit3") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit4") || fixtureA.getBody().getUserData().equals("buit4") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit5") || fixtureA.getBody().getUserData().equals("buit5") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit6") || fixtureA.getBody().getUserData().equals("buit6") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
                }
            });

        }

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("buit7") || fixtureA.getBody().getUserData().equals("buit7") && fixtureB.getBody().getUserData().equals("Personatge")) {

            vides--;
            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    if(vides == 0) {

                        joc.setScreen(new MainMenuScreen(joc));

                    }
                    else {

                        joc.setScreen(new Level2(joc, vides));

                    }
                }
            });

        }
	}
	//</editor-fold>

	//<editor-fold desc="Mètodes implementats de la interface ContactListener">
	@Override
	public void endContact(Contact contact) {

	}

	@Override
	public void preSolve(Contact contact, Manifold oldManifold) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postSolve(Contact contact, ContactImpulse impulse) {
		// TODO Auto-generated method stub

	}
	//</editor-fold>

}
